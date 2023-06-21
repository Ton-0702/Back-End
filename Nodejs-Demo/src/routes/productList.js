const express = require('express')
const router = express.Router()
const productListController = require('../controllers/productList')

router.get('/view-product-list', productListController.getAllBooks)

module.exports =router;