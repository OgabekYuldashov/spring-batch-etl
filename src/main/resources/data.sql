INSERT INTO test.role (role_id, role) VALUES (1, 'ADMIN');
INSERT INTO test.role (role_id, role) VALUES (2, 'USER');

INSERT INTO test.user (user_id, password, username) VALUES (1, '$2y$12$tm/ktTKU9IKLAUfw9QSPZ.uqm90tmx7A9/azYSgB.OnVwIn7HOkQu', 'admin');
INSERT INTO test.user (user_id, password, username) VALUES (2, '$2y$12$rFBAc2J9w0IUAUH6SBbIVOKnAVRZN0iSejdVLKTueg8AnJra2VzlW', 'user');

INSERT INTO test.user_role (user_id, role_id) VALUES (1, 1);
INSERT INTO test.user_role (user_id, role_id) VALUES (2, 2);