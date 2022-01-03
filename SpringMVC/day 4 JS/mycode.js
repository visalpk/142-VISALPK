function  somecode() {
    for (var i = 0; i <=10; i++) {
        var j=i;
        
    } 
    postMessage(i);
    setTimeout("somecode()",500);
}
somecode();
