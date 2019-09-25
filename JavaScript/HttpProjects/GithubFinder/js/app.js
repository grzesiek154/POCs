const github = new Github;

//search input 
const searchUser = document.getElementById('searchUser');

//search input event listener

searchUser.addEventListener('keyup', (e)=>{
    //get input text

    const userText = e.target.value;

    if(userText !== ''){
        // Make http call
        github.getUser(userText)
         .then(data => {
           if(data.profile.message === 'Not Found') {
             // Show alert
     
           } else {
             // Show profile
           }
         })
       } else {
         // Clear profile
         
       }
});