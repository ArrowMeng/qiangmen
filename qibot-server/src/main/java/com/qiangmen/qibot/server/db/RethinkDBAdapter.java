package com.qiangmen.qibot.server.db;

import com.rethinkdb.RethinkDB;
import com.rethinkdb.net.Connection;
import com.rethinkdb.net.Cursor;

public class RethinkDBAdapter {

	public static final RethinkDB r = RethinkDB.r;
	
	public static void main(String[] args) {
		Connection conn = r.connection().hostname("localhost").port(28015).connect();

		Cursor cursor = r.db("tinode").table("users").run(conn);
		for (Object doc : cursor) {
		    System.out.println(doc);
		}
	}
}
