function easyHTTP() {

    this.http = new XMLHttpRequest();
}

// make an http get reqest
easyHTTP.prototype.get = function(url, callback) {
    this.http.open('GET', url, true);

    let self = this;
    // onload is the function called when an XMLHttpRequest transaction completes successfully.
    this.http.onload = function() {
        if(self.http.status == 200) {
            callback(null, self.http.responseText);
        } else {
            callback("Error: "+ self.http.status);
        }
    }

    this.http.send();
}

// make an http post reqest

easyHTTP.prototype.post = function(url, data, callback) {
    this.http.open('POST', url, true);
    this.http.setRequestHeader('Content-type', 'application/json');

    let self = this;
        // onload is the function called when an XMLHttpRequest transaction completes successfully.
    this.http.onload = function() {

            callback(null, self.http.responseText);
       }

    this.http.send(JSON.stringify(data));
}
// make an http put reqest
easyHTTP.prototype.put = function(url, data, callback) {
    this.http.open('PUT', url, true);
    this.http.setRequestHeader('Content-type', 'application/json');

    let self = this;
        // onload is the function called when an XMLHttpRequest transaction completes successfully.
    this.http.onload = function() {

            callback(null, self.http.responseText);
       }

    this.http.send(JSON.stringify(data));
}

// make an http delete reqest
easyHTTP.prototype.delete = function(url, callback) {
    this.http.open('DELTE', url, true);

    let self = this;
    // onload is the function called when an XMLHttpRequest transaction completes successfully.
    this.http.onload = function() {
        if(self.http.status == 200) {
            callback(null, 'Post deleted');
        } else {
            callback("Error: "+ self.http.status);
        }
    }

    this.http.send();
}