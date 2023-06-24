const express = require('express');
const router = express.Router();
const anagramController = require('../controller/10_anagram')

router.get('/anagram', anagramController.checkAnagram)

module.exports =router;