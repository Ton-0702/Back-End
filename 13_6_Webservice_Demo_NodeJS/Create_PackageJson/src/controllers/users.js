function getAllUsers(req, res){
    const dataUsers = [
        {
            id:1,
            name: "Tú",
            age: 50,
            job: "Vũ công múa cột",
        },
        {
            id:2,
            name: "Vỹ",
            Age: 60,
            job: "Cảnh sát chìm ngỉm",
        },
        {
            id:3,
            name: "Toàn",
            Age: 19,
            job: "Học sinh Ưu Tú NodeJs",
        },
        {
            id:4,
            name: "Hiếu",
            Age: 40,
            job: "MoMo",
        },
    ];

    res.send(
        dataUsers
    )
};

// v1/getUser/:userId
function getUserById (req, res) {
    const dataUsers = [
        {
            id:1,
            name: "Tú",
            age: 50,
            job: "Vũ công múa cột",
        },
        {
            id:2,
            name: "Vỹ",
            Age: 60,
            job: "Cảnh sát chìm ngỉm",
        },
        {
            id:3,
            name: "Toàn",
            Age: 19,
            job: "Học sinh Ưu Tú NodeJs",
        },
        {
            id:4,
            name: "Hiếu",
            Age: 40,
            job: "MoMo",
        },
    ];
    const userId = req.params.userId; // lấy id từ routing
    console.log("userID: ", userId);
    dataUsers.forEach((element) => {
        if(element.id == userId) {
            res.send(element)
        }
    }); 
}

// query parameter
//// v1/getUserByNameAndAge?name=Name&age=20
function getUserByNameAndAge (req,res){
    // const { name, age } = req.query;
    // console.log("Name: ", name);
    // console.log("Age: ", age);
    // res.send({
    //     name,
    //     age
    // })

    // cách chuẩn
    const queryObject = req.query;
    console.log('queryObject: ', queryObject);
    console.log('Name: ', queryObject.name);
    console.log('Age: ', queryObject.age);
    res.send({
        name: queryObject.name,
        age: queryObject.age
    })
}

function createUser(req, res) {
    const { username, password, age } = req.body;

    res.send({
        username,
        password,
        age
    })
}

let lst = []
function createManyUsers(req,res){
    const userArray = req.body;

    console.log("userArray: ", userArray);
    userArray.map((element) => {
        lst.push({username: element.username, password:element.password, age:element.age})
    });
    console.log("lst: ", lst);

    res.send(
        lst
    )
}

module.exports = {
   getAllUsers,
   getUserById,
   getUserByNameAndAge,
   createUser,
   createManyUsers
}