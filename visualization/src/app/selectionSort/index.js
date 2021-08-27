arr = [
  200,102,25,69,12,280,145,139,39,178,98, 77,52
];

function selectionSort(a) {
  for (let i = 0; i < a.length; i++) {
    setTimeout(function timer() {
      let min = i;

      for (let l = i + 1; l < a.length; l++) {
        if (arr[l] < arr[min]) {
          min = l;
        }
      }
      if (min !== i) {
        console.log(a[i], a[min]);
        let temp = a[i];
        a[i] = a[min];
        a[min] = temp;

      }
      // console.log(arr)
      drawLines();
    }, i * 1000);
  }
}

// selectionSort(arr);
let sortStart = document.querySelector(".sort-start");
sortStart.addEventListener("click", function () {

  selectionSort(arr);
  // drawLines();
  var bars = document.querySelectorAll(".bars");
  //console.log(bars.classList.add = ('f'))
  bars.forEach(function (i, v) {
    i.classList.add("dl");
  });
});
let box = document.querySelector(".box");
function drawLines() {
  let box = document.querySelector(".box");
  let data = "";
  for (var i = 0; i < arr.length; i++) {
    data += `<div class="bars"></div>`;
  }
  box.innerHTML = data;
  let bars = document.querySelectorAll(".bars");
  bars.forEach(function (i, v) {
    let wid = ( box.clientWidth / arr.length) - 3;
    console.log(wid, "kkkkkkkkkkkk");
    i.style.height = (arr[v] / 500) * box.clientHeight + "px";
    i.style.width = wid + "px";
  });
}

document.onload = drawLines();
