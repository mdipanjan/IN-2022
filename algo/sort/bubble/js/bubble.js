let arr = [112,45,89,78,65,35,85,69,25,250,47,38,96,125,254,190,110,50,300,5,14,29,61]

function bubbleSort(){
  let sorted = false;
  let lastSorted = arr.length - 1;
  while(!sorted){
    sorted = true;
    for(let i= 0; i < lastSorted; i++ ){
      if(arr[i] > arr[i+1]){
        let temp = arr[i];
        arr[i] = arr[i+1];
        arr[i+1] = temp;
        sorted = false
        // console.log(arr[i])
      }
    }
    lastSorted--
  
  }
 
  console.log(arr)
}

document.querySelector('.btn').addEventListener('click', function(){
  bubbleSort()
})
