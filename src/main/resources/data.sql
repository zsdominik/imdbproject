ALTER TABLE MOVIE
    ALTER COLUMN genre ENUM('DRAMA',
                             'COMEDY',
                              'THRILLER',
                                 'ACTION',
                                 'ROMANCE',
                                 'FAMILY');
INSERT INTO MOVIE (id,title, release, description, rating,genre)
VALUES  ('1','Becket', 1965,'Who is the king?!', 7.3,0),
        ('2','Vertigo', 1958,'You must be alive', 8.3,2),
        ('3','Who am I', 2015, 'Never believe to yourself', 4.0,2),
        ('4','Montague', 1987, 'Romeo or Julia', 9.1,4),
        ('5','Santa Claus', 2004, 'Marry xmas', 7.1,5),
        ('6','Junior', 1998, 'Terminator was just the beginning', 3.9,1),
        ('7','Bees', 2020, 'Rise agents them', 7.9,2),
        ('8','Prototype', 2015, 'Yes, its actually the game', 8.3,3),
        ('9','We are the champions', 2019, 'Queen from The Queen', 9.4,0),
        ('10','Hey dude, its april 1', 1999, 'Your family become ur enemies', 2.9,5);

        ALTER TABLE TVSERIES
            ALTER COLUMN genre ENUM('DRAMA',
                                     'COMEDY',
                                      'THRILLER',
                                         'ACTION',
                                         'ROMANCE',
                                         'FAMILY');

INSERT INTO TVSERIES (id,title, release, description, rating,genre,finished)
VALUES('1','Vampire diaries',2010,'Vampires around us',1.7,4,1),
('2','Chernobyl',2017,'Come together as one',9.1,0,0),
('3','Teletabis',1998,'Oh no! The robo-hoover ate the cookies',10.0,5,1),
('4','Stranger things',2015,'In the early 80s the village awake',9.1,2,0),
('5','Suit',2012,'Ready for a new challenge',8.1,3,1),
('6','Friends',2000,'Joe, please stop!',9.8,5,1),
('7','All my love',1989,'My love brighter then the stars',7.1,4,0),
('8','Baratok kozt',1991,'Garden Vilmos and her wife aunt Magdi',2.1,5,0),
('9','Lucifer',2007,'The fallen angel just having fun',7.1,4,0);