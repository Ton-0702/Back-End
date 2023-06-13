const express = require("express");
const app = express();
const port = 3000;
const bookRouter = require('./routes/book');
const productListRouter = require('./routes/productList')
const userRouter = require('./routes/users')

// Có 2 cái json và urlencoded mới hoạt động được createUser router.post
app.use(express.json());
app.use(express.urlencoded({extended:true}));

// app.use('/v1/', productListRouter)
app.use('/v1/', userRouter)
// app.get('/message/:msg', (req,res) => {
//     let msg = req.params.msg;
//     console.log("Message: ",msg);
//     res.send("Message is sent...")
// })

// // app.get("/", (req,res) => {res.send("<h1>Hello World<h1>")});

app.listen(port, () => {
    console.log(`Server listening on port ${port}`);
})