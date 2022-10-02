



CREATE TABLE tbl_book
(
    `num`        int    NOT NULL auto_increment  COMMENT '번호', 
    `title`        VARCHAR(50)    NOT NULL    COMMENT '제목', 
    `author`      VARCHAR(30)    NOT NULL    COMMENT '작가', 
    `company`     VARCHAR(50)    NOT NULL    COMMENT '출판사', 
    `isbn`  	VARCHAR(30)       NOT NULL     COMMENT 'ISBN', 
    `count`      int        NOT NULL    COMMENT '보유도서수', 
    
     PRIMARY KEY (num)
);




insert into tbl_book(title, author, company, isbn, count)
values('해리포터와 아즈카반의 죄수','J.K 롤링','문학수첩','8983920726',12);
insert into tbl_book(title, author, company, isbn, count)
values('난중일기','이순신','서해문집','8974832232',8);
insert into tbl_book(title, author, company, isbn, count)
values('수학 귀신','한스 마그누스','비룡소','8949187310',9);
insert into tbl_book(title, author, company, isbn, count)
values('윌리를 찾아라!','마틴 핸드포드','예꿈','8992882734',20);
insert into tbl_book(title, author, company, isbn, count)
values('오세암','정채봉','창비','8936440195',4);






