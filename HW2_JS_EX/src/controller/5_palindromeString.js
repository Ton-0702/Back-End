// /api/palindrome/:string
function isPalindrome(req,res){
    const stringParam = req.params.string;
    let reverseString = "";
    for(let i=1; i <= stringParam.length; i++){
        reverseString += stringParam[stringParam.length-i];
    }
    if(reverseString !== stringParam){
        return res.send("String is not palindrome");
    }
    res.send("String is palindrome");
}

module.exports = {
    isPalindrome,
}