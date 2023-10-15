

INSERT INTO category(category_id,category_name,optional_desc) VALUES(1,"Non Fiction","Nonfiction books contain factual information, such as biographies and history books.");
INSERT INTO category(category_id,category_name,optional_desc) VALUES(2,"Fiction","Fiction books contain a story that the author made up, such as romance or children's books.");

INSERT INTO sub_category(category_fk,sub_category_name,optional_desc) VALUES(1,"Adventure","Adventure novels whisk readers off to faraway lands. Unlike fantasy novels, they tend to stay in the real world");
INSERT INTO sub_category(category_fk,sub_category_name,optional_desc) VALUES(2,"Fantacy","These stories take readers on a journey beyond the known world, to places conjured in the author’s imagination.");

INSERT INTO book(isbn,title,qty,author,unit_price,categoryid) VALUES("H001","The Alchemist ",12,"Paulo Coelho",2500.00,1);
INSERT INTO book(isbn,title,qty,author,unit_price,categoryid) VALUES("H002","Harry Potter and the Philosopher's Stone ",12,"JK Rowling",2500.00,1);


	   
	   {
        "isbn": "H002",
        "title": "Tresure Island",
        "qty": 32,
        "author": "J.K.Rowling",
        "unit_price": 4500.0,
        "categoryID": 2;
       }



        {
        "username": "Kamal",
        "password":"123"
      
       }


     {
       "sub_id": 1,
       "subCategoryName":"Adventure"
       "optionalDesc":"Adventure novels whisk readers off to faraway lands. Unlike fantasy novels, they tend to stay in the real world",
       "categId":{
       
            "categoryId": 1,
            "optional_desc": "Fiction books contain a story that the author made up, such as romance or children's books.",
            "categoryName": "Fiction"
        
       }
    }



   {
        "categoryId":1,
        "optional_desc":"Fiction books contain a story that the author made up, such as romance or children's books.",
        "categoryName":"Fiction"
       }