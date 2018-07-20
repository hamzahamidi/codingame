class A {

    /**
     * Executes the service with the given​​​​​​​‌​‌‌‌‌​‌‌‌​‌‌​​‌‌​‌‌‌‌‌‌ connection.
     */
    void a(Service s, Connection c) {
        // update this code
                s.setConnection(c);
                try {
                    s.execute();
                    c.commit();
                } catch (Exception e) {
                    c.rollback();
                } finally {
                    c.close();
                }
        }

}

interface Service {
        void execute() throws Exception;
        void setConnection(Connection c);
}

interface Connection {
        void commit();
        void rollback();
        void close();
}
