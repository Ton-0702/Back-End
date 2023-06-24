const express = require('express');
const app = express();
const port = 3000;
const sumRoutes = require('./routes/1_sumTwoNumber');
const sntRoutes = require('./routes/2_prime');
const maxNumberRoutes = require('./routes/3_maxNumber');
const reverseStringRoutes = require('./routes/4_reverseString');
const palindromeStringRoutes = require('./routes/5_palindromeString');
const countCharacterRoutes = require('./routes/6_countCharacter');
const createRandomStringRoutes = require('./routes/7_createRandomString');
const fizzRoutes = require('./routes/fizz');
const findIndexRoutes = require('./routes/findIndex');
const factorialRoutes = require('./routes/8_factorial');
const sortRoutes = require('./routes/9_sort');
const anagramRoutes = require('./routes/10_anagram');
const createObjectBookRoutes = require('./routes/11_createObjectBook');
const rectangleAreaRoutes = require('./routes/12_rectangleArea');
const evenArrayRoutes = require('./routes/13_evenArray');
const randomNumberRangeRoutes = require('./routes/14_randomNumberRange');
const perfectNumberRoutes = require('./routes/15_perfectNumber');

app.use(express.json());
app.use(express.urlencoded({extended:true}));

// 1. tinh tong cua 2 so
app.use('/api/', sumRoutes);

// 2. Kiểm tra một số có phải là số nguyên tố hay không
app.use('/api/', sntRoutes);

// 3. Tìm số lớn nhất trong một mảng.
app.use('/api/', maxNumberRoutes);

// 4. Đảo ngược một chuỗi.
app.use('/api/', reverseStringRoutes)

// 5. Kiểm tra một chuỗi có phải là chuỗi palindrome (Palindrome hay còn gọi là xâu đối xứng, 
// xâu đối gương là tên gọi của những xâu kí tự mà khi viết từ phải qua trái hay từ trái qua phải 
// thì xâu đó không thay đổi) hay không.
app.use('/api/', palindromeStringRoutes);

// 6. Đếm số lần xuất hiện của một ký tự trong một chuỗi.
app.use('/api/', countCharacterRoutes);

// 7. Tạo một chuỗi ngẫu nhiên với độ dài cho trước.
app.use('/api/', createRandomStringRoutes);

// nhập vào số n, trả về Fizz nếu n chia hết cho 3, trả về Buzz nếu n chia hết cho 5
// FizzBuzz nếu chia hết cho cả 2 nếu không thuộc trường hơp nào trả về "" (empty)
app.use('/api/', fizzRoutes);

// Nhập vào 1 chuỗi và vị trí của 1 ký tự, trả về ký tự đó trong chuỗi
app.use('/api/', findIndexRoutes)

// 8. Tính giai thừa của một số.
app.use('/api/', factorialRoutes)

// 9. Sắp xếp một mảng số theo thứ tự tăng dần.
app.use('/api/', sortRoutes)

// 10. Kiểm tra một chuỗi có phải là chuỗi anagram của chuỗi khác hay không.
// Anagram là thuật ngữ để chỉ hai chuỗi có số ký tự và các ký tự giống nhau, 
// nhưng thứ tự của các ký tự trong chuỗi có thể khác nhau. 
app.use('/api/', anagramRoutes)

// 11. Tạo một đối tượng đại diện cho một quyển sách
// với các thuộc tính như tiêu đề, tác giả và năm xuất bản
app.use('/api/', createObjectBookRoutes)


// 12. Tạo một đối tượng đại diện cho một hình chữ nhật với các thuộc tính như chiều dài,
//  chiều rộng và tính diện tích.
app.use('/api/', rectangleAreaRoutes)

// 13.  Viết một hàm lấy một mảng số và trả về một mảng mới chỉ chứa các số chẵn.
app.use('/api/', evenArrayRoutes)

// 14. Tạo một hàm tạo số ngẫu nhiên trong một khoảng cho trước.
app.use('/api/', randomNumberRangeRoutes)

// 15. Tạo một hàm kiểm tra xem một số có phải là số hoàn hảo
//  hay không (tổng các ước số bằng chính nó).
app.use('/api/', perfectNumberRoutes)

app.listen(port, () => {
 console.log(`Server is listening on port ${port}`);
})