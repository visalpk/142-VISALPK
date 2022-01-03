
//for-of loop
//for-in loop

var myarr=[1,2,34,45,6,6,7];

for(let i of myarr){
    console.log(i)
}

var myarr1=[true,34,35.0,"Rajesh"]

for(let i of myarr1){
    console.log(i)
}
//for-of--->i represents gives item(it can be any data type)
for(let j in myarr1){
    console.log(i)
}

//for-in--->j represents gives index

names="visal pk"
for(let j of myarr1) console.log(j);
for(let j in myarr1) console.log(j);