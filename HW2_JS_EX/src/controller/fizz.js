// /api//fizz/:int
function fizzDivide(req,res){
    const n = Number(req.params.int);
    // console.log(typeof n);
    if (n%3 ==0 && n%5==0){
        return res.send('Fizzbuzz');
    }else if (n%3==0){
        return res.send("Fizz");
    }else if (n%5==0) {
        return res.send("buzz")
    }else{
        return res.send("empty")
    }
}

module.exports= {
    fizzDivide,
}