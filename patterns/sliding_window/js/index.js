
// Q // Given an array, find the average of all contiguous subarrays of size ‘K’ in it.

function findAverageOfSubArrays(k, arr){
  let result = [];
  let windowSum = 0.0;
  let windowStart = 0;
  for (let windowEnd = 0; windowEnd < arr.length; windowEnd++) {
    windowSum += arr[windowEnd];
    //when windowend is greater than sub array size
    if(windowEnd >= k-1){
        // get avg of subarrays 
        result.push(windowSum/k);
        // reset windowsum for next window by removing window start element 
        windowSum = windowSum - arr[windowStart];
        // slide window by one
        windowStart += 1;
    }
  }
  return result;
}
const result = findAverageOfSubArrays(5, [1,3,2,6,-1,4,1,8,2]);
console.log(result);