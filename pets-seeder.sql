USE v_blog_db;

INSERT INTO pets (name, age, species)
VALUES ('Fred', 2, 'fish'),
('Sam', 3, 'Salamander'),
('Bud', 5, 'snake'),
('Mr. Pig', 6, 'turtle');

INSERT INTO pet_details (is_sterile, personality_description, weight_in_ounces, pet_id)
VALUES (true, 'he is friendly', 1, 1),
(false, 'he is nice', 1, 2),
(true, 'he is sly', 20, 3),
(false, 'he is slow', 40, 4);

