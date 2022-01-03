function Signup() {
    var email = document.getElementById("Email").value;
    var pwd = document.getElementById("pwd1").value;
    var upperCaseLetters = /[A-Z]/g;
    var filter = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;
    if (email == '') {
        alert("please enter mail ID.");
    } else if (pwd == '') {
        alert("enter the password");
    } else if (!filter.test(email)) {
        alert("Enter valid email id.");
    } else if (pwd.length < 6 || pwd.length > 6) {
        alert("Password min length is 6 character");
    } else if(pwd.value.match(upperCaseLetters)) {  
        alert("Enter atleast one Capital letter")
    } else {
        alert('Thank You for Login & Your signup');

    }
}

 