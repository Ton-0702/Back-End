function getAllBooks(req, res) {
    const DataProductList = [
        {
            img: "a",
            name: "aaa",
            price: 30
        },
        {
            img: "b",
            name: "bbb",
            price: 30
        },
        {
            img: "c",
            name: "ccc",
            price: 30
        },
        {
            img: "d",
            name: "ddd",
            price: 30
        },
    ];

    res.send(
        DataProductList
    );
};

module.exports = {
    getAllBooks
}