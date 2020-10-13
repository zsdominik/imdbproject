INSERT INTO MOVIE (id, title, release, description, rating)
VALUES  ('1','Becket', '1965-10-08','Who is the king?!', 7.3),
        ('2','Vertigo', '1958-01-22','You must be alive', 8.3),
        ('3','Who am I', '2015-06-25', 'Never believe to yourself', 4.0),
        ('4','Montague', '1987-01-01', 'Romeo or Julia', 9.1),
        ('5','Santa Claus', '2004-07-07', 'Marry xmas', 7.1),
        ('6','Junior', '1998-12-01', 'Terminator was just the beginning', 3.9),
        ('7','Bees', '2020-01-29', 'Rise agents them', 7.9),
        ('8','Prototype', '2015-03-31', 'Yes, its actually the game', 8.3),
        ('9','We are the champions', '2019-02-12', 'Queen from The Queen', 9.4),
        ('10','Hey dude, its april 1', '1999-06-16', 'Your family become ur enemies', 2.9);


INSERT INTO TVSERIES (id, title, release, description, rating, isFinished)
VALUES ('1','Vampire diaries','2010-11-11','Vampires around us',1.7,1),
       ('2','Chernobyl','2017-12-10','Come together as one',9.1,0),
       ('3','Teletabis','1998-01-02','Oh no! The robo-hoover ate the cookies',10.0,1),
       ('4','Stranger things','2015-01-10','In the early 80s the village awake',9.1,0),
       ('5','Suit','2012-07-14','Ready for a new challenge',8.1,1),
       ('6','Friends','2000-10-10','Joe, please stop!',9.8,1),
       ('7','All my love','1989-04-27','My love brighter then the stars',7.1,0),
       ('8','Baratok kozt','1991-09-30','Garden Vilmos and her wife aunt Magdi',2.1,0),
       ('9','Lucifer','2007-10-11','The fallen angel just having fun',7.1,0);
INSERT INTO GENRE(id,name)
VALUES ('1','Horror'),
       ('2','Thriller'),
       ('3','Fantasy'),
       ('4','Action'),
       ('5','Family'),
       ('6','Comedy'),
       ('7','Crime'),
       ('8','Mystery'),
       ('9','Romance'),
       ('10','Western'),
       ('11','Drama');
INSERT INTO MOVIE_GENRE(GENRE_ID,MOVIE_ID)
VALUES ('7','1'),
       ('11','1'),
       ('10','2'),
       ('4','2'),
       ('1','3'),
       ('2','3'),
       ('8','3'),
       ('9','4'),
       ('11','4'),
       ('6','5'),
       ('5','5'),
       ('6','6'),
       ('1','7'),
       ('3','8'),
       ('8','8'),
       ('11','9'),
       ('1','10'),
       ('2','10'),
       ('6','10');
INSERT INTO TVSERIES_GENRE(TVSERIES_ID,GENRE_ID)
VALUES ('1','1'),
       ('1','2'),
       ('1','9'),
       ('2','11'),
       ('3','6'),
       ('3','5'),
       ('4','1'),
       ('4','2'),
       ('5','7'),
       ('5','4'),
       ('6','5'),
       ('6','6'),
       ('6','9'),
       ('7','9'),
       ('7','11'),
       ('8','5'),
       ('9','7'),
       ('9','8'),
       ('9','9');
