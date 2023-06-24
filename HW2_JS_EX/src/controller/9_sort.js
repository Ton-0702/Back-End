// /api/sort
function swap(array, left, right){
    let temp = array[left]; 
    array[left] = array[right];
    array[right] = temp;
}

function partition(array, left, right){ //right là length-1
    let pivot = array[left];
    // console.log(pivot);
    let count_index = 0;
    for(let i=left+1; i<=right; i++){
        if (pivot >= array[i]){
            count_index +=1;
        }
    }

    let pivot_index_new = left+count_index;

    // hoán vị index giá trị chốt(pivot) ban đầu và index của chốt mới =>
    // cho chốt nằm giữa (và cho biết bao nhiêu giá trị nhỏ hơn chốt, bao nhiêu giá trị lớn hơn chốt)
    swap(array, left, pivot_index_new);

    let i = left;
    let j = right;

    // lặp nếu left bé hơn index chốt và nếu right lớn hơn
    while(i < pivot_index_new && j > pivot_index_new){
        // Nếu giá trị thứ i nhỏ hơn = chốt thì tăng i lên vì không cần phải xét chuyển vị trí
        while(array[i] <= pivot){
            i++;
        }

        while(array[j] >= pivot){
            j--;
        }

        // điều kiện nếu index i sau khi tăng và j sau khi giảm vẫn nằm dưới, lớn hơn chốt index thì swap
        if (i < pivot_index_new && j > pivot_index_new){
            swap(array, i, j)
        }
        
    }
    // return về chốt mớt để thực hiện lại đệ quy xét tại chốt mới
    return pivot_index_new
}

function quickSort(array, left, right){
    if (left >= right){
        return;
    }

    let pivot = partition(array, left, right);
    // console.log(pivot);
    // sắp xếp mảng bên trái
    quickSort(array, left, pivot-1);

    // sắp xếp mảng bên phải
    quickSort(array, pivot+1, right);

}

function sortASC(req, res){
    const {array} = req.body;
    console.log(array[0]);
    quickSort(array, 0, array.length -1);
    res.send(array)
}

module.exports = {
    sortASC,
}