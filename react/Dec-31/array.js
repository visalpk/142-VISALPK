//1.Rest Operator
//2.Spread Operator(...)

var arr=[4,5,6,7,89,9]
var names=["kumar","bala"]
console.log(arr);

var result= arr+names //taking as string 
var result1=[arr,names]//taking array of array

//Spread operator ---->Spread the  no of arguments
var result2=[...arr,...names]//tripper dot array

console.log(typeof result2);

console.log(result2);

function add(x,y,z){
 return x+y+z;
}
//rest operator ---->variable no of arguments
function add2(x,y,...z){
    //...z-rest operator
    
    //return x+y+z;
    res=0
    res=x+y
    for(let i of z){
        res+=i
    }
    return res;
   }


console.log(add(1,2,3));
console.log(add2(1,2,3,4,5,6));