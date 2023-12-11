INSERT INTO tb_category(id, description) VALUES (1, 'Curso de HTML');
INSERT INTO tb_category(id, description) VALUES (2, 'Oficina de GitHub');

INSERT INTO tb_participant(id, name, email) VALUES(1, 'José Silva', 'jose@gmail.com');
INSERT INTO tb_participant(id, name, email) VALUES(2, 'Tiago Faria', 'tiago@gmail.com');
INSERT INTO tb_participant(id, name, email) VALUES(3, 'Maria do Rósario', 'maria@gmail.com');
INSERT INTO tb_participant(id, name, email) VALUES(4, 'Teresa Silva', 'teresa@gmail.com');

INSERT INTO tb_activity(id, name, description, price, category_id) VALUES (1, 'Curso de HTML', 'Aprenda HTML de forma prática', 80.00, 1);
INSERT INTO tb_activity(id, name, description, price, category_id) VALUES(2, 'Oficina de GitHub', 'Controle de versões e seus projetos', 50.00, 2);

INSERT INTO tb_block(id, start, finish, activity_id) VALUES (1, TIMESTAMP WITH TIME ZONE '2017-09-25T08:00:00Z',TIMESTAMP WITH TIME ZONE '2017-09-25T11:00:00Z', 1);
INSERT INTO tb_block(id, start, finish, activity_id) VALUES (2, TIMESTAMP WITH TIME ZONE '2017-09-25T14:00:00Z',TIMESTAMP WITH TIME ZONE '2017-09-25T18:00:00Z', 2);
INSERT INTO tb_block(id, start, finish, activity_id) VALUES (3, TIMESTAMP WITH TIME ZONE '2017-09-26T08:00:00Z',TIMESTAMP WITH TIME ZONE '2017-09-26T11:00:00Z', 2);

INSERT INTO tb_events_attend(price, quantity, activity_id, participant_id) VALUES(80.00, 1, 1, 1);
INSERT INTO tb_events_attend(price, quantity, activity_id, participant_id) VALUES(50.00, 1, 2, 1);
INSERT INTO tb_events_attend(price, quantity, activity_id, participant_id) VALUES(80.00, 1, 1, 2);
INSERT INTO tb_events_attend(price, quantity, activity_id, participant_id) VALUES(80.00, 1, 1, 3);
INSERT INTO tb_events_attend(price, quantity, activity_id, participant_id) VALUES(50.00, 1, 2, 3);
INSERT INTO tb_events_attend(price, quantity, activity_id, participant_id) VALUES(80.00, 1, 1, 4);