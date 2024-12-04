using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Data.SqlClient;

namespace OOP20243
{
    public partial class Principal : Form
    {
        //metodo para cargar los datos en el grid
        public void cargarDatos()
        {
            try
            {
                //crear objeto de conexion a la BD
                SqlConnection con = new SqlConnection(Properties.Resources.cadenaConexion);
                //redactar la consulta a sql
                String sql = "SELECT ProductoID, Codigo, Nombre, Costo, PrecioVenta, Existencias, Comentarios FROM Producto";
                //crear un adaptador de datos
                SqlDataAdapter da = new SqlDataAdapter(sql,con);
                //crear un objeto para depositar los datos descargados
                DataTable dt = new DataTable();
                //llenar el objeto de datos usando el adaptador de datos
                da.Fill(dt);
                //apuntar el origen de datos de grid1 hacia el objeto de datos
                grid1.DataSource = dt;
            }catch(Exception ex)
            {
                MessageBox.Show(ex.Message);
            }
        }

        public Principal()
        {
            InitializeComponent();
        }

        private void pruebaConexion_Click(object sender, EventArgs e)
        {
            //prueba de conexion
            try
            {
                //crear objeto de conexion a la base de datos
                SqlConnection con = new SqlConnection(Properties.Resources.cadenaConexion);
                //ejecutar una prueba de conexion al servidor: abrir conexion
                con.Open();
                //si llego aqui es porque la prueba exitosa
                MessageBox.Show("Conexion exitosa");
                //cerrar la conexion a la base de datos
                con.Close();
            }catch(Exception ex)
            {
                MessageBox.Show(ex.Message); //mostrar mensaje en caso de error
            }
        }

        private void Principal_Load(object sender, EventArgs e)
        {
            //MessageBox.Show("Bienvenido");
            //mandar a llamar el metodo que llena a grid1
            this.cargarDatos();
            try{
                //personalizar grid1
                //ocultar el selector de filas
                grid1.RowHeadersVisible = false;
                //evitar que se pueda editar dentro del grid
                grid1.ReadOnly = true;
                //prohibir poder aregar o eliminar filas en el grid
                grid1.AllowUserToAddRows = false;
                grid1.AllowUserToDeleteRows = false;
                //evitar que se le pueda cambiar el ancho a las columnas
                grid1.AllowUserToResizeColumns = false;
                //prohibir poder mover las columnas de su posicion
                grid1.AllowUserToOrderColumns = false;
                //evitar poder cambiar la altura de las filas
                grid1.AllowUserToResizeRows = false;
                //colocar etiquetas a los titulos de algunas columnas
                grid1.Columns["ProductoID"].HeaderText = "ID";
                grid1.Columns["Nombre"].HeaderText = "Nombre de Producto";
                grid1.Columns["PrecioVenta"].HeaderText = "Precio de Venta";
                //cambiar la alineacion del texto de las columnas donde hay decimales
                grid1.Columns["Costo"].DefaultCellStyle.Alignment = DataGridViewContentAlignment.MiddleRight;
                grid1.Columns["PrecioVenta"].DefaultCellStyle.Alignment = DataGridViewContentAlignment.MiddleRight;
                grid1.Columns["Existencias"].DefaultCellStyle.Alignment = DataGridViewContentAlignment.MiddleRight;
            }
            catch (Exception){

            }
        }
    }
}
