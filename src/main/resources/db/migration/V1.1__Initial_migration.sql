CREATE TABLE characters (
  id SERIAL PRIMARY KEY,
  name VARCHAR(100),
);

CREATE TABLE heroes (
  id SERIAL PRIMARY KEY,
  money INTEGER,
  character INTEGER REFERENCES characters(id)
);

CREATE TABLE enemies (
  id SERIAL PRIMARY KEY,
  character INTEGER REFERENCES characters(id)
);
