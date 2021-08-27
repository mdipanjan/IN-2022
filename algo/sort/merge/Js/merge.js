let arr = [1,25,12,14,258,54,58];

function mergeSort(a){
  let n = a.length;
  if(n < 2){
    return
  }else{
    let middle = (n/2).toFixed() - 1;
    let left = [];
    let right = [];
    for(let i = 0; i < middle ; i++){
      left[i] = a[i]
    }
    for(let i =  middle; i < n ; i++){
      right[i - middle] = a[i]
    }
    console.log(left, right);
    // mergeSort(left);
    // mergeSort(right);
  }
  

}
mergeSort(arr)