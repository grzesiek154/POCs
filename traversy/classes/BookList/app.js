//bok constructor

function Book(title, author, isbn) {
  this.title = title;
  this.author = author;
  this.isbn = isbn;
}

//ui consturctor

function UI() {}

// Add book to list
UI.prototype.addBookToList = function(book) {
    const list= document.getElementById('book-list');

    //create tr element
    const row = document.createElement('tr');

    row.innerHTML = `
    <td>${book.title}</td>
    <td>${book.author}</td>
    <td>${book.isbn}</td>
    <td><a href="#" class="delete">X</a></td>
    `;

    list.appendChild(row);
}


//show alert
UI.prototype.showAlert = function(message, className) {

    const div = document.createElement('div');
    div.className = `${className}`;
    //add test
    div.appendChild(document.createTextNode(message));

    //get parent
    const container = document.querySelector('.container');
    const form = document.querySelector('#book-form');
    container.insertBefore(div,form);

    
    setTimeout(function(){
        document.querySelector("."+className).remove();
    }, 3000);
}

//ui clear fileds

UI.prototype.crearFields = function() {
    document.getElementById('title').value = '';
    document.getElementById('author').value = '';
    document.getElementById('isbn').value = '';
}

UI.prototype.removeBookFromList = function(target) {
        if(target.className === 'delete') {
        e.target.parentElement.parentElement.remove();
        } 
}

//event listeners

document.getElementById("book-form").addEventListener("submit", function(e) {

  const title = document.getElementById("title").value,
    author = document.getElementById("author").value,
    isbn = document.getElementById("isbn").value;

    const book = new Book(title, author, isbn);
    const ui = new UI();

    //validate 
    if(title == '' || author == '' || isbn == '') {
        ui.showAlert('Please fill all fields', 'error');
    } else{
        ui.showAlert('Book Added', 'success')
        ui.addBookToList(book);
        ui.crearFields();
    }
   
    ui.removeBookFromList();
    e.preventDefault();
});

document.getElementById('book-list').addEventListener('click', function(e){
    // Instantiate UI
  const ui = new UI();

  // Delete book
  ui.deleteBook(e.target);

  // Show message
  ui.showAlert('Book Removed!', 'success');

  e.preventDefault();
})