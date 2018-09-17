def main():
    """
    The main function. Run this to start the program.
    :return: None
    """
    print("\nLaunching PizzaFundraiser 2.0...\n"
          "*insert startup music*")

    name = ask_for_customer_name()  # string variable to store customer's name
    order = []  # list variable to store customer's order

    asking = True
    while asking:
        print("\n-*-*-*-* MAIN MENU *-*-*-*-\n"
              "1) Change customer name (current name: {})\n"
              "2) Print order summary\n"
              "3) View pizza menu\n"
              "4) Add pizzas to order\n"
              "5) Remove pizzas from order\n"
              "6) Sort order alphabetically\n"
              "7) Finalise order\n"
              "8) Reset order\n"
              "9) Exit program".format(name))
        option = input("Your choice: ")

        if option == "1":  # change customer name
            name = ask_for_customer_name()

        elif option == "2":  # print order summary
            print("\nViewing {}'s order:".format(name))
            if len(order) == 0:  # if there are no items in the order
                print("No pizzas in order.")
            else:
                for item in order:
                    print("- {}".format(item))
                print("Total cost: ${}".format(len(order) * 20))  # all pizzas are $20

        elif option == "3":  # view pizza menu
            show_menu()

        elif option == "4":  # add pizzas to order
            order = order_pizzas(order)  # this function asks the user what pizzas they want to order, and returns an updated list of pizzas

        elif option == "5":  # remove pizzas from order
            order = remove_pizzas(order)
            if order == None:  # I hate python. Why must it be dynamically typed?!?!?!?!?!? WHYYyyYYYYYYYYYyyYYY??? Why can't we use java?? I hate python!! a lot!!!!!!
              order = []

        elif option == "6":  # sort order alphabetically
            order = sorted(order)
            print("\nYour order has been sorted alphabetically.")

        elif option == "7":  # finalise order
            confirming = True
            while confirming:
                if name is None:
                    print("\nYou need to enter a name for the order first.")
                    name = ask_for_customer_name()
                elif len(order) == 0:
                    print("\nYour order is empty. Please add some pizzas first.")
                    confirming = False
                else:
                    if confirm_finalise_order(order, name):
                        print("\nYour order has been finalised! Returning to main menu...\n"
                              "Feel free to make another order now.")
                        order = []
                        name = None
                        confirming = False
                    else:
                        print("\nYour order was not finalised. Returning to main menu...")
                        confirming = False

        elif option == "8":  # reset order
            confirming = True
            while confirming:  # code to confirm if user really wants to reset their order
                reset = input("Are you sure you want to reset your order? y/n")
                if reset == "y":
                    # resetting the order and the customer's name
                    order = []
                    name = None
                    confirming = False
                    print("Your order has been reset. Returning to main menu...")
                elif reset == "n":  # do nothing
                    confirming = False
                    print("Your order was not reset. Returning to main menu...")
                else:
                    print("Please type 'y' or 'n'.")

        elif option == "9":  # exit program
            asking = False
            print("\nProgram exited.\n"
                  "Thank you for using PizzaFundraiser. 0.1% of funds raised will be donated to the school!")

        else:
            print("Please enter a number between 1 and 9.")


def ask_for_customer_name():
    """
    Asks the customer for their name.
    :return: the customer's input
    :rtype: string
    """
    asking = True
    while asking:
        name = input("\nPlease enter your first name: ")
        if name.isalpha() and 20 >= len(name) >= 2:  # name must be A-Z and have 2-20 letters
            asking = False
            return name
        else:
            print("Name must be A-Z, have 2-20 letters, and must not contain spaces.")


def remove_pizzas(order):
    """
    Removes pizzas from the order. The code loops until the user types 'exit'.
    :param order: A list of pizzas that the customer wants
    :return: An updated list of pizzas, with some items removed.
    :rtype: list
    """
    removing = True
    while removing:
        # print out order
        print("\nYour order:")
        item_number = 0  # the index of the item in the list

        # printing order out
        for item in order:
            print("{}) {}".format(item_number, item))
            item_number = item_number + 1

        if len(order) == 0:  # if there are no pizzas in the list
            print("Your order is empty. Cannot remove pizzas while order is empty.\n"
                  "Returning to main menu...")
            removing = False

        else:
            num_to_remove = input(
                "Please type the number of the pizza to remove, or type 'exit' to return to main menu: ")

            try:
                if num_to_remove == "exit":
                    print("Returning to main menu...")
                    removing = False
                    return order

                elif 0 <= int(num_to_remove) < len(order):
                    order.pop(int(num_to_remove))
                    print("Item removed from order!")
                
                else:
                    print("Please enter a number between 0 and {}, or type 'exit' to exit to main menu.".format(len(order) - 1))

            except ValueError:
                print("Please enter a number between 0 and {}, or type 'exit' to exit to main menu.".format(len(order) - 1))


def order_pizzas(order):
    """
    Adds pizzas to the order.
    :param order: A list of pizzas.
    :return: An updated list of pizzas.
    :rtype: list
    """

    if len(order) >= 10:
        print("\nYour order already has 10 pizzas. Orders cannot exceed 10 pizzas.")

    else:
        show_menu()
        ordering = True

        while ordering:
            num_of_pizzas = input("\nHow many pizzas to order? ")

            if not num_of_pizzas.isdigit():  # if user input isn't a number
                print("Please enter a number between 1 and 10.")

            else:
                if len(order) + int(num_of_pizzas) > 10:  # if order length + user input is greater than 10
                    print(
                        "Your order already has {} pizzas, adding {} pizzas will exceed the limit of 10 pizzas per order.".format(
                            len(order), num_of_pizzas))
                    num_of_pizzas = 10 - len(
                        order)  # only add enough pizzas to reach 10 pizzas in the order then stop adding.
                    print("Will only add {} pizzas instead.".format(num_of_pizzas))

                    while int(num_of_pizzas) > 0:  # add pizzas to the order
                        order = add_pizza(order)
                        num_of_pizzas = num_of_pizzas - 1
                    ordering = False

                elif 1 <= int(num_of_pizzas) <= 10:  # if number of pizzas is between 1 and 10
                    while int(num_of_pizzas) > 0:
                        order = add_pizza(order)
                        num_of_pizzas = int(num_of_pizzas) - 1
                    ordering = False

                else:
                    print("Please enter a number between 1 and 10.")
    return order


def show_menu():
    """
    Prints out a menu for the user.
    :return: None
    """
    print("\n-*-*-* PIZZA MENU *-*-*-\n"
          "All pizzas cost $20.\n"
          "1) Meat Lover's\n"
          "2) Pepperoni\n"
          "3) Vegetarian\n"
          "4) BBQ Chicken\n"
          "5) Brains\n"
          "6) Hawaiian")


def confirm_finalise_order(order, name):
    """
    Checks with the user if they really want to finalise order.
    :param order: A list of pizzas.
    :param name: The customer's name
    :return: True or False, depending if the user said yes or no
    :rtype: bool
    """
    # print out order
    print("\n{}'s order:".format(name))
    for item in order:
        print("- {}".format(item))
    print("Total cost: ${}".format(len(order) * 20))  # all pizzas are $20

    confirming = True
    while confirming:
        confirm = input("\nConfirm finalise order y/n? ")
        if confirm == "y":
            confirming = False
            return True
        if confirm == "n":
            confirming = False
            return False
        else:
            print("Please type 'y' or 'n'.")


def add_pizza(order):
    """
    Add a single pizza to the order.
    :param order: A list of pizzas.
    :return: an updated list of pizzas.
    :rtype: list
    """
    ordering = True
    while ordering:
        pizza = input("Which pizza? Please enter a number: ")
        if pizza == "1":
            print("Added 1 meat lover's pizza to order.")
            order.append("Meat Lover's - $20")
            ordering = False

        elif pizza == "2":
            print("Added 1 pepperoni pizza to order.")
            order.append("Pepperoni - $20")
            ordering = False

        elif pizza == "3":
            print("Added 1 vegetarian pizza to order.")
            order.append("Vegetarian - $20")
            ordering = False

        elif pizza == "4":
            print("Added 1 BBQ chicken pizza to order.")
            order.append("BBQ Chicken - $20")
            ordering = False

        elif pizza == "5":
            print("Added 1 brains pizza to order.")
            order.append("Brains - $20")
            ordering = False

        elif pizza == "6":
            print("Added 1 Hawaiian pizza to order.")
            order.append("Hawaiian - $20")
            ordering = False

        else:
            print("Please enter a number between 1 and 6.")
    return order


main()  # execute code
