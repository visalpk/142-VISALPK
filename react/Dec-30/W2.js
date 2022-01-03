var  stud=[{id:101,name:'raj',cmarks:45,pmarks:55,mmarks:67}
	,{id:102,name:'rajesh',cmarks:65,pmarks:85,mmarks:77}
 	,{id:103,name:'suraj',cmarks:43,pmarks:55,mmarks:60}
	,{id:104,name:'tom',cmarks:71,pmarks:65,mmarks:70}];
var z=[]

for(i=0; i<5;i++){
  
  z[i]=stud[i].cmarks+stu[i].pmarks+stu[i].mmarks;
  z[i]=z[i]/3;
  }

function maxi(){
  for(i=0; i<5;i++){
    if(z[i]>z[i-1]){
      i=i  }
}
 console.log(i);
return i;
}
v=calc();
w=maxi();
