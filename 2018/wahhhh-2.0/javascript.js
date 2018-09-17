var context = new (window.AudioContext || window.webkitAudioContext)();

var oscillator = context.createOscillator();

oscillator.type = 'sine';
oscillator.frequency.value = 440;
oscillator.connect(context.destination);
oscillator.start();

var gain = context.createGain();
oscillator.connect(gain);
gain.connect(context.destination);

var now = context.currentTime;
gain.gain.setValueAtTime(1, now);
gain.gain.exponentialRampToValueAtTime(0.001, now + 0.5);
oscillator.start(now);
//oscillator.stop(now + 0.5);

function playSound(slideposition) {}
  // 11 is pedal Bb
  // 21 is low Bb
  // 22 is low A
  // and so on (partial, slide position)
  // 11 12 13 14 15 16 17
  // 21 22 23 24 25 26 27
  // 31 32 33 34 35 36 37
  // 41 42 43 44 45 46 47
  // 51 52 53 54 55 56 57
  // 61 62 63 64 65 66 67
  // 71 72 73 74 75 76 77
  // 81 82 83 84 85 86 87
  // maybe make an array? idk?
  
var s21 = [a series of amplitudes];
  
var harmonic1 = 116.54; // default note is Bb2
var harmonic2 = 2 * harmonic1;
var harmonic3 = 3 * harmonic1;
var harmonic4 = 4 * harmonic1;
var harmonic5 = 5 * harmonic1;
var harmonic6 = 6 * harmonic1;
var harmonic7 = 7 * harmonic1;
var harmonic8 = 8 * harmonic1;
