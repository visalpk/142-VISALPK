/*3. WAP to perform sorting of below data based on id and name(create class, object and a method for sorting in util class)
	{id:101,name:raj}
	{id:121,name:rajesh}
	{id:130,name:suraj}
	{id:114,name:tom}*/

NameList=[{id:101,name:"raj"},
	{id:121,name:"rajesh"},
	{id:130,name:"suraj"},
	{id:114,name:"tom"}]
for(i=0;i<NameList.length;i++){
for(let j of NameList[i].id){
	console.log(j) 
}
}
