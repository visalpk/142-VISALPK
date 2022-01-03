//2.calc the given 3*3 identity or not
function check(mat) {
    for (let i=0; i<mat.length; i++) 
     {
      for (let j=0; j<mat.length; j++)
       {
         if (i==j && mat[i][j]!=1)
                return false;
            else if (i!=j && mat[i][j]!=0)
                return false;
      }
    }
    return true;
  }
  
  console.log(check([[1, 0, 0],  [0, 1, 0],  [0, 0, 1]]))
  console.log(check([[1, 0, 1],  [0, 1, 0],  [0, 0, 1]]))
  console.log(check([[1, 0, 1],  [0, 1, 2],  [0, 0, 1]]))