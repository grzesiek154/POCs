export default class ImageManager {

    test() {
        const cards = document.querySelectorAll('.card-front');
        console.log(cards);
    }

  getArrayWitLimitedValues() {
    const cards = document.querySelectorAll('.card-front');
    let arr = [];

        while(arr.length != cards.length) {
            let val = getRandomVal(0,6);
            let count = 0;
            let temp = 0;
            let i = 0;

            if (temp == val) {
                count++;
            }
            arr[i] = val;
            i++;
            
        }
            

}
    getRandomVal(min, max) {
        min = Math.ceil(min);
        max = Math.floor(max);
        let val = Math.floor(Math.random() * (max - min)) + min;  
        
      
        return val;    
    }


    setRandomImage(val) {

        const cards = document.querySelectorAll('.card-front');
        const cardImgaes = [
        "img/icon1.png",
        "img/icon2.png",
        "img/icon3.png",
        "img/icon4.png",
        "img/icon5.png",
        "img/icon6.png"
        ];

        for (let i = 0; i < cards.length; i++) {
            val = this.getRandomVal(0,6);
            cards[i].style.backgroundImage = `url(${cardImgaes[val]})`;
            // cards.forEach(el =>{
            // el.style.backgroundImage = `url(${cardImgaes[val]})`;
            // });
           
            console.log(val);
        }
    }
  
}



