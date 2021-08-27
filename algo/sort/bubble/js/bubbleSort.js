arr = [112,45,89,78,65,35,85,69,25,250,47,38,96,125,254,190,110,50,300,5,14,29,61]

function bubbleSort(a){
    var swap = 0;
    for(  let i=0; i < a.length; i++){
        setTimeout( function(){
            //console.log(a[i])
            let current = a[i];
            let next = a[i+1];
            
            if( a[i] > a[i+1]){
                a[i] = next;
                a[i+1] = current;
                swap++
            }
            if(swap > 0){
                bubbleSort(a);
            }
        }, i*800 );
       
        // var current = a[i];
        // var next = a[i+1];

        // if( a[i] > a[i+1]){
        //     a[i] = next;
        //     a[i+1] = current;
        //     swap++
           
        // }
    }
    // console.log(a)
   
}

bubbleSort(arr);