const express = require('express')
const router = express.Router();

// res.send trả về cho frontEnd dùng

router.get('/books', (req,res) => {
    const data = [
        {name:'Tieng chim hot trong bui man gai', price:200000},
        {name: 'Chiec thuyen ngoai xa', price: 150000}
    ]
    res.send (
        data
    );
});

module.exports = router; // khai báo router trên xong thì cần exports ra ngoài để bên ngoài dùng là index.js có thể import vô dùng dc

