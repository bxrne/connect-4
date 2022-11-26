package de.ls5.dywa.generated.util;

public class TypeInfo {
	private static java.util.Map<Long, java.lang.Class<?>> idToClassMap = new java.util.HashMap<>();
	private static java.util.Map<Long, java.util.Map<Long, String>> typeFieldNamesMap = new java.util.HashMap<>();
	private static java.util.Map<Long, String> typeNamesMap = new java.util.HashMap<>();
	private static java.util.Set<Long> enumTypes = new java.util.HashSet<>();
	private static java.util.Set<Long> allTypes = new java.util.HashSet<>();
	
	static {
		/* DBType _dh6bymwneewzvvv */
		typeNamesMap.put(0L, "ConcreteUser");
		idToClassMap.put(0L, de.ls5.dywa.generated.entity.models.app.ConcreteUserImpl.class);
		allTypes.add(0L);
		java.util.Map<Long, String> map0 = new java.util.HashMap<Long, String>();
		map0.put(7L, "baseUser");
		map0.put(8L, "dywaSwitchedTo");
		typeFieldNamesMap.put(0L, map0);
		/* DBType _udys4mwneewzvvv */
		typeNamesMap.put(1L, "BaseUser");
		idToClassMap.put(1L, de.ls5.dywa.generated.entity.models.app.BaseUserImpl.class);
		allTypes.add(1L);
		java.util.Map<Long, String> map1 = new java.util.HashMap<Long, String>();
		map1.put(9L, "concreteUser");
		map1.put(10L, "password");
		map1.put(11L, "image");
		map1.put(12L, "username");
		map1.put(13L, "email");
		map1.put(14L, "wins");
		map1.put(15L, "losses");
		typeFieldNamesMap.put(1L, map1);
		/* DBType _bk7lagkuee2cw5_ */
		typeNamesMap.put(2L, "Board");
		idToClassMap.put(2L, de.ls5.dywa.generated.entity.models.app.BoardImpl.class);
		allTypes.add(2L);
		java.util.Map<Long, String> map2 = new java.util.HashMap<Long, String>();
		map2.put(16L, "columns");
		typeFieldNamesMap.put(2L, map2);
		/* DBType _dw6gawkuee2cw5_ */
		typeNamesMap.put(3L, "Column");
		idToClassMap.put(3L, de.ls5.dywa.generated.entity.models.app.ColumnImpl.class);
		allTypes.add(3L);
		java.util.Map<Long, String> map3 = new java.util.HashMap<Long, String>();
		map3.put(17L, "cells");
		map3.put(18L, "index");
		typeFieldNamesMap.put(3L, map3);
		/* DBType _n5bpygmoee2sl80 */
		typeNamesMap.put(4L, "Cell");
		idToClassMap.put(4L, de.ls5.dywa.generated.entity.models.app.CellImpl.class);
		allTypes.add(4L);
		java.util.Map<Long, String> map4 = new java.util.HashMap<Long, String>();
		map4.put(19L, "value");
		typeFieldNamesMap.put(4L, map4);
		/* DBType _mee9kwy7ee2dfcv */
		typeNamesMap.put(5L, "Game");
		idToClassMap.put(5L, de.ls5.dywa.generated.entity.models.app.GameImpl.class);
		allTypes.add(5L);
		java.util.Map<Long, String> map5 = new java.util.HashMap<Long, String>();
		map5.put(20L, "player2");
		map5.put(21L, "player1");
		map5.put(22L, "board");
		typeFieldNamesMap.put(5L, map5);
		/* DBType _ryh6gwy8ee2dfcv */
		typeNamesMap.put(6L, "Result");
		idToClassMap.put(6L, de.ls5.dywa.generated.entity.models.app.ResultImpl.class);
		allTypes.add(6L);
		java.util.Map<Long, String> map6 = new java.util.HashMap<Long, String>();
		map6.put(23L, "loser");
		map6.put(24L, "winner");
		typeFieldNamesMap.put(6L, map6);
	}
	
	public static String getGeneratedClassName(Long typeId) {
		java.lang.Class<?> clazz =  idToClassMap.get(typeId);
		return clazz != null ? clazz.getName() : null;
	}
	
	public static java.lang.Class<?> getGeneratedClass(Long typeId) {
		return idToClassMap.get(typeId);
	}
	
	public static java.util.Collection<Class<?>> getAllGeneratedClasses() {
		return idToClassMap.values();
	}
	
	public static java.util.List<String> getAllGeneratedClassNames() {
		return idToClassMap.values().stream().map(Class::getName).collect(java.util.stream.Collectors.toList());
	}
	
	public static boolean isEnumerable(Long id) {
		return enumTypes.contains(id);
	}
	
	public static boolean typeInUse(Long typeId) {
		return allTypes.contains(typeId);
	}
	
	public static java.util.Map<Long, String> getTypeFieldNames(Long typeId) {
		return typeFieldNamesMap.get(typeId);
	}
	
	public static String getTypeName(Long id) {
		return typeNamesMap.get(id);
	}
}
