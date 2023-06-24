const express = require('express');
const router = express.Router();
const sortController = require('../controller/9_sort');

router.get('/sort', sortController.sortASC);

module.exports = router;
