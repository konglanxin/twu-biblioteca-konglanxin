1.Who checked out the book 'The Hobbit’?
sql:SELECT m.name FROM Book b, Checkout_item c, Member m WHERE b.TITLE="The Hobbit" AND c.book_id = b.id AND m.id = c.member_id;
2.How many people have not checked out anything?
sql:SELECT COUNT(*) from Member WHERE id NOT IN (SELECT member_id FROM Checkout_item);
3.What books and movies aren't checked out?
sql:SELECT a.title FROM Book a WHERE NOT EXISTS (SELECT * FROM Checkout_item WHERE book_id=a.id)
    UNION
    SELECT b.title FROM Movie b WHERE NOT EXISTS (SELECT * FROM Checkout_item WHERE movie_id=b.id);
4.Add the book 'The Pragmatic Programmer', and add yourself as a member. Check out 'The Pragmatic Programmer'. Use your query from question 1 to verify that you have checked it out. Also, provide the SQL used to update the database.

5.Who has checked out more that 1 item? Tip: Research the GROUP BY syntax.
sql:SELECT a.name FROM Member a WHERE 1 < (SELECT COUNT(*) FROM Checkout_item b WHERE a.id = b.member_id);