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

INSERT INTO chew_toys (brand, description, is_destroyed, name, pet_id)
VALUES ('Mattel', 'A stuffed elephant', false, 'Snuffy', 1),
('Hasbro', 'A stuffed rabbit', false, 'Hoppers', 1),
('Bradley', 'A rubber mouse', true, 'Mr. Squeaks', 1)


INSERT INTO vets (address, name, phone_number)
VALUES ('123 Memory Lane', 'Dr. Kim Sanders', '210-555-4848'),
('824 Waldo Way', 'Dr. Fred Barnes', '210-555-5432'),
('156 Lakehills', 'Dr. Pam Shot', '210-555-8888'),
('867 Vista Drive', 'Dr. Sam Smith', '210-555-1010');

INSERT INTO pets_vets (pet_id, vet_id)
VALUES (1, 1),
       (1, 2),
       (3, 3);