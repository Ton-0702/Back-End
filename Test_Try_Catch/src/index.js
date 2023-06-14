const express = require('express');
const userRouter = require('./routes/users')
const app = express()
const port = 3000;

app.use(express.json());
app.use(express.urlencoded({extended:true}));
// thay vì dùng app.use(express.json()) ta có thể dùng cách này
// app.use((req, res, next) => {
//     let body = "";
//     req.on("data", (chunk) => {
//         body += chunk;
//     });

//     req.on("end", () => {
//         req.body = JSON.parse(body);
//         next();
//     });
// });

// Thêm 1 user mới
// --- Add vào 1 middleware check các điều kiện sau
// Kiểm tra req.body.username không vượt quá 20 ký tự
//  kiểm tra req.body.password không vượt quá 8 ký tự

// function validate (req, res, next) {
//     const { username } = req.body
//     if (username === undefined){
//         next("Username is required");
//     }

//     next();
// }

app.use('/v1/', userRouter)

app.listen(port, () => {
    console.log(`Server listening on port ${port}`);
})