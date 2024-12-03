namespace OOP20243
{
    partial class Principal
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(Principal));
            this.pruebaConexion = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // pruebaConexion
            // 
            this.pruebaConexion.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.pruebaConexion.Location = new System.Drawing.Point(308, 175);
            this.pruebaConexion.Name = "pruebaConexion";
            this.pruebaConexion.Size = new System.Drawing.Size(165, 68);
            this.pruebaConexion.TabIndex = 0;
            this.pruebaConexion.Text = "Probar Conexión";
            this.pruebaConexion.UseVisualStyleBackColor = true;
            this.pruebaConexion.Click += new System.EventHandler(this.pruebaConexion_Click);
            // 
            // Principal
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(255)))), ((int)(((byte)(255)))), ((int)(((byte)(192)))));
            this.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Stretch;
            this.ClientSize = new System.Drawing.Size(723, 378);
            this.Controls.Add(this.pruebaConexion);
            this.Icon = ((System.Drawing.Icon)(resources.GetObject("$this.Icon")));
            this.Name = "Principal";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "20012002049 Gerardo";
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.Button pruebaConexion;
    }
}

