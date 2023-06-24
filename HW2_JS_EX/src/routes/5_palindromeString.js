const express = require('express');
const router = express.Router();
const palindromeStringController = require('../controller/5_palindromeString');

router.get('/palindrome/:string', palindromeStringController.isPalindrome);

module.exports = router;