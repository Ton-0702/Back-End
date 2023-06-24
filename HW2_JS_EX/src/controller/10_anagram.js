// /api/anagram/stringOne=sf&stringTwo=fda
// function swap(array, left, right){
//     let temp = array[left]; 
//     array[left] = array[right];
//     array[right] = temp;
// }

function checkAnagram(req,res){
    let s1 = req.query.stringOne.split('');
    let s2 = req.query.stringTwo.split('');
    // console.log(s1);
    const length_str1 = s1.length;
    const length_str2 = s2.length;
    // console.log(length_str1);
    // console.log(length_str2);
    if (length_str1 != length_str2){
        return res.send("Not Anagram");
    }

    for (let i=0; i<length_str1 - 1; i++){
        for (let j=i+1; j<length_str1; j++){
            if(s1[i] > s1[j]){
                // swap(s1, s1[i], s1[j])
                let temp = s1[i];
                s1[i] = s1[j];
                s1[j] = temp;
            }

            if(s2[i] > s2[j]){
                // swap(s2, s2[i], s2[j])
                let temp = s2[i];
                s2[i] = s2[j];
                s2[j] = temp;
            }
        }
    }
    // console.log(s1[0] > s1[1]);
    console.log(s1);
    console.log(s2);

    let s1_new = s1.join("");
    let s2_new = s2.join("");
    
    if(s1_new === s2_new){
        return res.send("Is Anagram")
    }
    res.send("Not Anagram")
}

module.exports = {
    checkAnagram,
}