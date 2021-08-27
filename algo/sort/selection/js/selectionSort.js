arr = [112,45,89,78,65,35,85,69,25,250,47,38,96,125,254,190,110,50,300,5,14,29,61];

function selectionSort(a){
    for(let i=0; i < a.length; i++){
        setTimeout( function timer(){
            let min = i;
        
            for(let l= i+1; l < a.length; l++){
                if(arr[l] < arr[min]){
                    min = l;
                }
            }
            if(min !== i){
                let temp = a[i];
                a[i] = a[min];
                a[min] = temp;
            }
            // console.log(arr)
            drawLines();
        }, i*800 );

    }
    
}

// selectionSort(arr);
let sortStart = document.querySelector('.sort-start');
sortStart.addEventListener('click',function(){
    selectionSort(arr);
    drawLines();
    var bars = document.querySelectorAll('.bars');
    //console.log(bars.classList.add = ('f'))
    bars.forEach(function(i,v){
        (i.classList.add('dl'))
    })
    
    
});
let box = document.querySelector('.box');
function drawLines(){
   
    let box = document.querySelector('.box');
    let data = '';
    for(var i=0; i < arr.length; i++){
        data+= `<div class="bars"></div>`
    }
    box.innerHTML = data;
    let bars = document.querySelectorAll('.bars');
    bars.forEach(function(i,v){
        (i.style.height = arr[v]+'px')
    })
    
}
document.onload =  drawLines();

