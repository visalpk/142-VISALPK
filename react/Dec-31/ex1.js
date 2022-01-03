//1) Give third array which is addition of even items from both array.

arr1=[10,20,30,40,50,45,67];
arr2=[34,23,56,89,22,11];
a=[]
b=[]
function findevennadd(a){
 res=0
 evenarr=[]
    for(let i of a){
       if(i%2==0){        
            evenarr.push(i)
                 }
          }
        return evenarr;
} 
function add(s,d){
  n=Math.min(s.length,d.length);
  console.log(n)
  newarr=[]
  for(i=0;i<n;i++){
    newvalue=s[i]+d[i]
    newarr.push(newvalue)
                  }
  return newarr;
}
arr3=findevennadd(arr1)
arr4=findevennadd(arr2)
arr5=add(arr3,arr4)