const http = new EasyHTTP;

// get users

// http.get('https://jsonplaceholder.typicode.com/users')
//     .then(data => console.log(data))
//     .catch(err => console.log(err));

// user data
const data = {
    name: 'John Doe',
    username: 'johnedoe123',
    email: 'john@hmail.com'
}

const data2 = {
    name: 'John Doe22',
    username: 'johnedoe123',
    email: 'john@hmail.com'
}

http.post('https://jsonplaceholder.typicode.com/users', data)
    .then(data => console.log(data))
    .catch(err => console.log(err));

http.put('https://jsonplaceholder.typicode.com/users/2', data2)
    .then(data => console.log(data))
    .catch(err => console.log(err));

//delete user
http.delete('https://jsonplaceholder.typicode.com/users/2')
    .then(data => console.log(data))
    .catch(err => console.log(err));