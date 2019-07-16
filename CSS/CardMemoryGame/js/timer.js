

const countdownStartButton = document.getElementById('start');
const countdownStopButton = document.getElementById('stop');
let timeRemaining = 0;
let intervalId;

function setTime(minutesAmount) {
  timeRemaining = timeRemaining + minutesAmount;

  displayTime();
  intervalId = startCountDown();
}

function displayTime() {

  let timerDiv = document.querySelector('.timer');

  let displaySeconds = timeRemaining;


  let minutes = 0;
  while(displaySeconds >= 60) {
    minutes = minutes + 1;
    displaySeconds = displaySeconds - 60;
  }
  
  if(minutes < 10) {
    minutes = '0' + minutes;
  }
  
  if(displaySeconds < 10) {
    displaySeconds = '0' + displaySeconds;
  }

  timerDiv.innerHTML = `${minutes}:${displaySeconds}`;
}



function startCountDown() { 
let interval = setInterval(function(){
      timeRemaining = timeRemaining -1;
      displayTime();
    },1000);

    return interval;
  }



function stopCountDown(intervalToStop) {
  clearInterval(intervalToStop);
}

countdownStartButton.addEventListener('click', function(){
  setTime(120)
});

countdownStopButton.addEventListener('click', function(){
  stopCountDown(intervalId);
});