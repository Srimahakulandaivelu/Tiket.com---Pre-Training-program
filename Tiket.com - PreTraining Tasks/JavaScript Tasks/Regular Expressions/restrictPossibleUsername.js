let username = "JackOfAllTrades";
let userCheck = /^[a-z]([0-9]{2,}|[a-z]+[0-9]*)$/i; // Change this line
let result = userCheck.test(username);