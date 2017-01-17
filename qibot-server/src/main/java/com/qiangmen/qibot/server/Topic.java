package com.qiangmen.qibot.server;

import java.util.Date;
import java.util.Map;

public class Topic {

	private String name;
	private String original;
	private int cat;
	private boolean isProxy;
	private Date created;
	private Date updated;
	private int lastId;
	private int clearId;
	private String userAgent;
	private long owner;
	private int accessAuth;
	private int accessAnon;
	private Map<Long, PerUserData> perUser;
	private Map<String, PerSubsData> perSubs;
	private Map<Session, Boolean> sessions;
}
