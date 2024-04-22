--liquibase formatted sql

--changeset mightyloot:1
INSERT INTO users (id, first_name, last_name, user_time_zone, username, email, phone_number, password, role)
VALUES
    (1, 'John', 'Doe', 'UTC', 'johndoe', 'johndoe@example.com', '+1234567890', 'hashed_password', 'USER'),
    (2, 'Alice', 'Smith', 'UTC', 'alicesmith', 'alice@example.com', '+2345678901', 'hashed_password', 'USER'),
    (3, 'Emily', 'Brown', 'UTC', 'emilybrown', 'emily@example.com', '+3456789012', 'hashed_password', 'USER'),
    (4, 'Michael', 'Johnson', 'UTC', 'michaelj', 'michael@example.com', '+4567890123', 'hashed_password', 'USER'),
    (5, 'Sophia', 'Martinez', 'UTC', 'sophiam', 'sophia@example.com', '+567890123', 'hashed_password', 'USER'),
    (6, 'William', 'Garcia', 'UTC', 'williamg', 'william@example.com', '+6789012345', 'hashed_password', 'USER'),
    (7, 'Olivia', 'Miller', 'UTC', 'oliviam', 'olivia@example.com', '+7890123456', 'hashed_password', 'USER'),
    (8, 'James', 'Davis', 'UTC', 'jamesd', 'james@example.com', '+8901234567', 'hashed_password', 'USER'),
    (9, 'Emma', 'Wilson', 'UTC', 'emmaw', 'emma@example.com', '+9012345678', 'hashed_password', 'USER'),
    (10, 'Liam', 'Taylor', 'UTC', 'liamt', 'liam@example.com', '+0123456789', 'hashed_password', 'USER');

INSERT INTO notes (id, title, content, user_id)
VALUES
    (1, 'Meeting Notes', 'Discuss quarterly goals.', 1),
    (2, 'Shopping List', 'Eggs, milk, bread.', 2),
    (3, 'Project Ideas', 'Brainstorm ideas for new project.', 3),
    (4, 'Meeting Agenda', 'Agenda items for the weekly meeting.', 4),
    (5, 'Recipe', 'Ingredients and instructions for lasagna.', 5),
    (6, 'Project Timeline', 'Plan for upcoming project milestones.', 6),
    (7, 'Research Notes', 'Findings from recent research study.', 7),
    (8, 'Travel Itinerary', 'Details for upcoming trip.', 8),
    (9, 'To-Do List', 'Tasks for the week ahead.', 9),
    (10, 'Journal Entry', 'Reflections on the day.', 10);

INSERT INTO notifications (id, title, content, status, user_id, notification_time)
VALUES
    (1, 'New Message', 'You have a new message.', 'PENDING', 1, '2024-04-20 08:00:00'),
    (2, 'Reminder', 'Don''t forget about the meeting tomorrow.', 'PENDING', 2, '2024-04-19 18:00:00'),
    (3, 'Alert', 'Emergency maintenance tonight.', 'PENDING', 1, '2024-04-19 23:59:00'),
    (4, 'Meeting Reminder', 'Reminder for the meeting tomorrow.', 'PENDING', 3, '2024-04-21 09:00:00'),
    (5, 'New Task Assigned', 'You have been assigned a new task.', 'PENDING', 4, '2024-04-20 15:00:00'),
    (6, 'Server Maintenance', 'Scheduled maintenance tonight.', 'PENDING', 5, '2024-04-20 23:00:00'),
    (7, 'Weekly Report', 'Submit your weekly report by Friday.', 'PENDING', 6, '2024-04-21 12:00:00'),
    (8, 'Birthday Notification', 'Wish Emily a happy birthday!', 'PENDING', 7, '2024-04-22 00:00:00'),
    (9, 'New Feature Announcement', 'Check out the latest feature updates.', 'PENDING', 8, '2024-04-21 10:00:00'),
    (10, 'Emergency Alert', 'Emergency evacuation drill tomorrow.', 'PENDING', 9, '2024-04-21 08:00:00');

INSERT INTO urls (id,title, content, url, user_id)
VALUES
    (1,'OpenAI', 'Artificial Intelligence research organization.', 'https://www.openai.com', 1),
    (2,'GitHub', 'Development platform for code hosting.', 'https://github.com', 2),
    (3,'Google', 'Internet search engine.', 'https://www.google.com', 3),
    (4,'CNN', 'News website for current events.', 'https://www.cnn.com', 4),
    (5,'Netflix', 'Streaming platform for movies and TV shows.', 'https://www.netflix.com', 5),
    (6,'Reddit', 'Online community for discussions.', 'https://www.reddit.com', 6),
    (7,'LinkedIn', 'Professional networking site.', 'https://www.linkedin.com', 7),
    (8,'Amazon', 'E-commerce platform for online shopping.', 'https://www.amazon.com', 8),
    (9,'Twitter', 'Social media platform for microblogging.', 'https://www.twitter.com', 9),
    (10,'Instagram', 'Social media platform for sharing photos.', 'https://www.instagram.com', 10);
