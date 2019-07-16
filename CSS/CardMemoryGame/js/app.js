let card = document.querySelector('.card');
const cardsList = document.querySelector('.flex-container');



function cardFlip(e) {
    if (e.target.parentElement.classList.contains('card')) {
        e.target.parentElement.classList.toggle('flip');
    }
}





//document.body.addEventListener('click', cardFlip);

cardsList.addEventListener('click', cardFlip);



